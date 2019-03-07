//const {search} = require("./linear_search.js");
import search from "./linear_search.js";

test("Test linear search algorithm function", () => expect(search([1, 2, 3], 5)).toBe(false));
test("Test linear search algorithm function", () => expect(search([1, 2, 3], 3)).toBe(true));
