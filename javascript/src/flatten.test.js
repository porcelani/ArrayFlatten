const flatten = require('./arrays');

test('[1,2,3,4] -> [1,2,3,4]', () => {
  array = [1,2,3,4]
  expect(flatten(array)).toEqual([1,2,3,4]);
});

test('[[1],[2],[3],[4] -> [1,2,3,4]', () => {
  array = [[1],[2],[3],[4]];
  expect(flatten(array)).toEqual([1,2,3,4]);
});

test('[[1,2,[3]],4] -> [1,2,3,4]', () => {
  array = [[1,2,[3]],4];
  expect(flatten(array)).toEqual([1,2,3,4]);
});