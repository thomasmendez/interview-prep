import unittest
from lib import binary_search_tree

class TestBinarySearchTree(unittest.TestCase):
    def setUp(self):
        self.bst = binary_search_tree.BinarySearchTree()
        self.bst.insert(50)
        self.bst.insert(30)
        self.bst.insert(70)
        self.bst.insert(20)
        self.bst.insert(40)
        self.bst.insert(60)
        self.bst.insert(80)

    def test_insert(self):
        self.assertEqual(self.bst.inorder_traversal(), [20, 30, 40, 50, 60, 70, 80])

    def test_search_existing(self):
        result = self.bst.search(40)
        self.assertIsNotNone(result)
        self.assertEqual(result.val, 40)

    def test_search_non_existing(self):
        result = self.bst.search(90)
        self.assertIsNone(result)

    def test_search_root(self):
        result = self.bst.search(40)
        self.assertIsNotNone(result)
        self.assertEqual(result.val, 40)

    def test_delete_leaf_node(self):
        self.bst.delete(20)
        self.assertIsNone(self.bst.search(20))
        self.assertEqual(self.bst.inorder_traversal(), [30, 40, 50, 60, 70, 80])

    def test_delete_node_with_one_child(self):
        self.bst.delete(30)
        self.assertIsNone(self.bst.search(30))
        self.assertEqual(self.bst.inorder_traversal(), [20, 40, 50, 60, 70, 80])

    def test_delete_node_with_two_children(self):
        self.bst.delete(50)
        self.assertIsNone(self.bst.search(50))
        self.assertEqual(self.bst.inorder_traversal(), [20, 30, 40, 60, 70, 80])

    def test_delete_non_existing_node(self):
        self.bst.delete(90)
        self.assertEqual(self.bst.inorder_traversal(), [20, 30, 40, 50, 60, 70, 80])

    def test_min_value_node_root(self):
        min_node = self.bst._min_value_node(self.bst.root)
        self.assertEqual(min_node.val, 20)

    def test_min_value_node_left_subtree(self):
        min_node = self.bst._min_value_node(self.bst.root.left)
        self.assertEqual(min_node.val, 20)

    def test_min_value_node_right_subtree(self):
        min_node = self.bst._min_value_node(self.bst.root.right)
        self.assertEqual(min_node.val, 60)

if __name__ == '__main__':
    unittest.main()
