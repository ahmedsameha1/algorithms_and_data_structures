import unittest
import linear_search

class TestLinearSearch(unittest.TestCase):
    def test_search(self):
        self.assertTrue(linear_search.search([1, 3, 5], 5))
        self.assertFalse(linear_search.search([1, 3, 5], 7))
        
if __name__ == "__main__":
    unittest.main()