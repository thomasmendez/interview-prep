class TreeNode:
    def __init__(self, key):
        self.val = key
        self.left = None
        self.right = None
        
class BinarySearchTree:
    def __init__(self):
        self.root = None
    
    def insert(self, key):
        self.root = self._insert_recursive(self.root, key)

    def _insert_recursive(self, node, key):
        if node is None:
            return TreeNode(key)
        
        if key < node.val:
            node.left = self._insert_recursive(node.left, key)
        else:
            node.right = self._insert_recursive(node.right, key)

        return node
    
    def search(self, key):
        return self._search_recursive(self.root, key)
    
    def _search_recursive(self, node, key):
        if node is None or node.val == key:
            return node
        
        if key < node.val:
            return self._search_recursive(node.left, key)
        else:
            return self._search_recursive(node.right, key)
        
    def delete(self, key):
        self.root = self._delete(self.root, key)

    def _delete(self, root, key):
        if root is None:
            return root

        # If the key to be deleted is smaller than the root's key, it's in the left subtree
        if key < root.val:
            root.left = self._delete(root.left, key)

        # If the key to be deleted is greater than the root's key, it's in the right subtree
        elif key > root.val:
            root.right = self._delete(root.right, key)

        # If key is the same as root's key, then this is the node to be deleted
        else:
            # Node with only one child or no child
            if root.left is None:
                return root.right
            elif root.right is None:
                return root.left

            # Node with two children: Get the inorder successor (smallest in the right subtree)
            temp = self._min_value_node(root.right)

            # Copy the inorder successor's content to this node
            root.val = temp.val

            # Delete the inorder successor
            root.right = self._delete(root.right, temp.val)

        return root

    def _min_value_node(self, node):
        current = node
        while current.left is not None:
            current = current.left
        return current
        
    def inorder_traversal(self):
        result = []
        self._inorder_traversal(self.root, result)
        return result
    
    def _inorder_traversal(self, root, result):
        if root:
            self._inorder_traversal(root.left, result)
            result.append(root.val)
            self._inorder_traversal(root.right, result)

    def preorder_traversal(self):
        result = []
        self._pre_order_traversal(self.root, result)
        return result
    
    def _pre_order_traversal(self, root, result):
        if root:
            result.append(root.val)
            self._pre_order_traversal(root.left, result)
            self._pre_order_traversal(root.right, result)
    
    def postorder_traversal(self):
        result = []
        self._post_order_traversal(self.root, result)
        return result
    
    def _post_order_traversal(self, root, result):
        if root:
            self._post_order_traversal(root.left, result)
            self._post_order_traversal(root.right, result)
            result.append(root.val)
        
def main():
    bst = BinarySearchTree()
    bst.insert(50)
    bst.insert(30)
    bst.insert(70)
    bst.insert(20)
    bst.insert(40)
    bst.insert(60)
    bst.insert(80)

    print("Inorder traversal of the BST:")
    print(bst.inorder_traversal())

    search_value = 40
    result = bst.search(search_value)
    if result:
        print(f"{search_value} found in the BST.")
    else:
        print(f"{search_value} not found in the BST.")

    bst.delete(40)
    print("Inorder traversal of the BST:")
    print(bst.inorder_traversal())

    search_value = 40
    result = bst.search(search_value)
    if result:
        print(f"{search_value} found in the BST.")
    else:
        print(f"{search_value} not found in the BST.")

if __name__ == "__main__":
    main()