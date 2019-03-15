import unittest
import selection_sort

class TestSelectionSort(unittest.TestCase):
    def test_selection_sort(self):
        self.assertListEqual(selection_sort.sort([4, 3, 2, 1]), [1, 2, 3, 4])
        self.assertListEqual(selection_sort.sort([-47, -168, 111, 4, 3, 10, 2, 1, 18, 1000, 8, 0]), [-168, -47, 0, 1, 2, 3, 4, 8, 10, 18, 111, 1000])

if __name__ == "__main__":
    unittest.main()
