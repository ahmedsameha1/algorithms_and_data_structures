import unittest
import merge_sort

class TestMergeSort(unittest.TestCase):
    def test_merge_sort(self):
        self.assertListEqual(merge_sort.sort([23, 14, 62, -1, 79, 40, 237, 136, -78]),[-78, -1, 14, 23, 40, 62, 79, 136, 237])
        self.assertListEqual(merge_sort.sort([4, 3, 2, 1]), [1, 2, 3, 4])

if __name__ == "__main__":
    unittest.main()
