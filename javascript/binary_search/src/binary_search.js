const search = (arr, num) => {
    return search_recursive(arr, 0, arr.length - 1, num);
}

const search_recursive = (arr, start, end, num) => {
    let median = Math.floor((start + end) / 2);
    if ( arr[median] == num) {
        return true;
    } else if (end - start < 1) {
        return false;
    } else if ( arr[median] < num) {
        return search_recursive(arr, median + 1, end, num);
    } else {
        return search_recursive(arr, start, median - 1, num);
    }
}

exports.search = search;
