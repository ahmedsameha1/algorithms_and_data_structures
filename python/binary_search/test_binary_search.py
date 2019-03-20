import unittest
import binary_search

class TestBinarySearch(unittest.TestCase):
    def test_binary_search(self):
        self.assertFalse(binary_search.search([1, 3, 5], 7))
        self.assertTrue(binary_search.search([1, 3, 5], 5))
        self.assertTrue(binary_search.search([1, 3, 5], 3))
        self.assertTrue(binary_search.search([1, 3, 5], 1))
        self.assertTrue(binary_search.search([-536, -66, -1, 1, 3, 5, 100, 1754], -66))
        self.assertFalse(binary_search.search([-536, -66, -1, 1, 3, 5, 100, 1754], 7))

if __name__ == "__main__":
    unittest.main()
