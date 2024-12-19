```groovy
def myMethod(param) {
  if (param == null) {
    return null // Return null explicitly
  } else if(param instanceof Integer) { 
    return param * 2 // Handle integer properly
  } else {
    return 0 //Or throw exception 
  }
}

println myMethod(null)
println myMethod(5)
println myMethod("test")
```