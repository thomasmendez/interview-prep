class TreeNode:
    def __init__(self, key):
        self.value = key
        self.left = None
        self.right = None

class BinarySearchTree:
    def __init__(self):
        self.root = None

    def insert(self, key):
        self.root = self._insert_recursive(self.root, key)
    
    def _insert_recursive(self, root, key):
        if root is None:
            return TreeNode(key)
        
        if key < root.value:
            root.left = self._insert_recursive(root.left, key)
        else:
            root.right = self._insert_recursive(root.right, key)

        return root