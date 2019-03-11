const {search} = require("./binary_search");

test("Test binary search algorithm implementation", () => expect(search([1, 2, 3], 5)).toEqual(false));
test("Test binary search algorithm implementation", () => expect(search([1, 2, 3], 3)).toEqual(true));
test("Test binary search algorithm implementation", () => expect(search([1, 3, 5], 5)).toEqual(true));
test("Test binary search algorithm implementation", () => expect(search([1, 3, 5], 1)).toEqual(true));
test("Test binary search algorithm implementation", () => expect(search([1, 3, 5], 7)).toEqual(false));
test("Test binary search algorithm implementation", () => expect(search([-536, -66, -1, 1, 3, 5, 100, 1754], 7)).toEqual(false));
test("Test binary search algorithm implementation", () => expect(search([-536, -66, -1, 1, 3, 5, 100, 1754], -66)).toEqual(true));
