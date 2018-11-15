function flatten(array) {
  var result = [];

  array.forEach(element => {
    if (element instanceof Array)
      result = result.concat(flatten(element))
    else
      result.push(element)
  });

  return result;
}
module.exports = flatten;