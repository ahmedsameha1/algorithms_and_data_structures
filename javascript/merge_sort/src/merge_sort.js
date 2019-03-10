const sort = (arr) => {
    if (arr.length < 2) {
        return arr;
    } else {
        return merge(sort(arr.slice(0, arr.length / 2)), sort(arr.slice(arr.length / 2, arr.length)));
    }
}

const merge = (arr1, arr2) => {
    merged_arr = [];
    let i = 0, j = 0;
    while(merged_arr.length < arr1.length + arr2.length) {
        merged_arr.push(i >= arr1.length || (j < arr2.length && arr2[j] < arr1[i])? arr2[j++] : arr1[i++]);
    }
    return merged_arr;
}

exports.sort = sort;
