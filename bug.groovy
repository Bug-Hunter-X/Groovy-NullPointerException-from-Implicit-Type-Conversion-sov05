```groovy
def myMethod(param) {
  if (param == null) {
    return 0 //This will cause a NullPointerException in later use
  }
  // ... rest of the method
}

println myMethod(null)
println myMethod(5)
```