import unittest
import bubble_sort

class TestBubbleSort(unittest.TestCase):
    def test_bubble_sort(self):
        self.assertListEqual(bubble_sort.sort([34, 12, -7, 101, 28]), [-7, 12, 28, 34, 101])
        self.assertListEqual(bubble_sort.sort([4, 3, 2, 1]), [1, 2, 3, 4])

if __name__ == "__main__":
    unittest.main()
