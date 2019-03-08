const {sort} = require("./selection_sort");

test("Test selection sort algorithm implementation",
     () => expect(sort([23, 10, 1, -7, 2, 66, 14])).toEqual([-7, 1, 2, 10, 14, 23, 66]));
test("Test selection sort algorithm implementation",
     () => expect(sort([4, 3, 2, 1, -1])).toEqual([-1, 1, 2, 3, 4]));
test("Test selection sort algorithm implementation",
     () => expect(sort([27, 3, 372, 1, -568])).toEqual([-568, 1, 3, 27, 372]));
test("Test selection sort algorithm implementation",
     () => expect(sort([15, 73, 104, 15, 52, -1])).toEqual([-1, 15, 15, 52, 73, 104]));
