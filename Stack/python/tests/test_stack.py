import unittest
from lib import stack

class TestStack(unittest.TestCase):
    def setUp(self):
        self.stack = stack.Stack()

    def test_push(self):
        self.stack.push(10)
        self.stack.push(20)
        self.assertEqual(self.stack.peek(), 20)

    def test_pop(self):
        self.stack.push(10)
        self.stack.push(20)
        self.assertEqual(self.stack.pop(), 20)
        self.assertEqual(self.stack.peek(), 10)

    def test_peek(self):
        self.stack.push(10)
        self.assertEqual(self.stack.peek(), 10)
        self.stack.push(20)
        self.assertEqual(self.stack.peek(), 20)

    def test_is_empty(self):
        self.assertTrue(self.stack.is_empty())
        self.stack.push(10)
        self.assertFalse(self.stack.is_empty())
        self.stack.pop()
        self.assertTrue(self.stack.is_empty())

    def test_size(self):
        self.assertEqual(self.stack.size(), 0)
        self.stack.push(10)
        self.stack.push(20)
        self.assertEqual(self.stack.size(), 2)
        self.stack.pop()
        self.assertEqual(self.stack.size(), 1)

    def test_pop_empty_stack(self):
        with self.assertRaises(IndexError):
            self.stack.pop()

    def test_peek_empty_stack(self):
        with self.assertRaises(IndexError):
            self.stack.peek()

if __name__ == "__main__":
    unittest.main()
