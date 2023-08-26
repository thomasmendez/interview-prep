import unittest
from lib import linked_list

class LinkedListTestCase(unittest.TestCase):
    def setUp(self):
        self.linked_list = linked_list.LinkedList()

    def test_append(self):
        self.linked_list.append(1)
        self.assertEqual(self.linked_list.head.value, 1)

    def test_prepend(self):
        self.linked_list.prepend(1)
        self.assertEqual(self.linked_list.head.value, 1)

        self.linked_list.prepend(0)
        self.assertEqual(self.linked_list.head.value, 0)

    def test_insert_after(self):
        self.linked_list.append(1)
        self.linked_list.append(3)
        self.linked_list.insert_after(self.linked_list.head, 2)
        self.assertEqual(self.linked_list.head.next.value, 2)

    def test_delete_node(self):
        self.linked_list.append(1)
        self.linked_list.append(2)
        self.linked_list.append(3)
        self.linked_list.delete_node(2)
        self.assertEqual(self.linked_list.head.next.value, 3)

    def test_search(self):
        self.linked_list.append(1)
        self.linked_list.append(2)
        self.linked_list.append(3)
        self.assertTrue(self.linked_list.search(2))
        self.assertFalse(self.linked_list.search(4))

    def test_access_by_index(self):
        self.linked_list.append(0)
        self.linked_list.append(1)
        self.linked_list.append(2)
        self.linked_list.append(3)
        self.assertEqual(self.linked_list.access_by_index(2), 2)
        with self.assertRaises(IndexError):
            self.linked_list.access_by_index(5)

    def test_size(self):
        self.assertEqual(self.linked_list.size(), 0)
        self.linked_list.append(1)
        self.linked_list.append(2)
        self.linked_list.append(3)
        self.assertEqual(self.linked_list.size(), 3)

    def test_display(self):
        expected_output = "0 1 2 3"
        self.linked_list.append(0)
        self.linked_list.append(1)
        self.linked_list.append(2)
        self.linked_list.append(3)

        # Capture the standard output when calling display()
        import sys
        from io import StringIO
        saved_stdout = sys.stdout
        try:
            out = StringIO()
            sys.stdout = out
            self.linked_list.display()
            output = out.getvalue().strip()
            self.assertEqual(output, expected_output)
        finally:
            sys.stdout = saved_stdout

if __name__ == '__main__':
    unittest.main()
