//: Playground - noun: a place where people can play

import Foundation

func isPrime(_ number: Int) -> Bool {
    if number <= 1 {
        return false
    }
    
    if number <= 3 {
        return true
    }
    
    if number % 2 == 0 || number % 3 == 0 {
        return false
    }
    
    var i = 5
    while i * i <= number {
        if number % i == 0 || number % (i + 2) == 0 {
            return false
        }
        i += 6
    }
    
    return true
}

func printPrimeNumbers(num1: Int, num2: Int) {
    print("Prime numbers between \(num1) and \(num2) are:")
    for number in num1...num2 {
        if isPrime(number) {
            print(number, terminator: " ")
        }
    }
    print()
}

func getPrimeNumbers(num1: Int, num2: Int) -> [Int] {
    return (num1...num2).filter { isPrime($0) }
}

let primeNumbers: (Int, Int) -> [Int] = { num1, num2 in
    return (num1...num2).filter { isPrime($0) }
}

printPrimeNumbers(num1: 1, num2: 50)
print(getPrimeNumbers(num1: 1, num2: 50))
print(primeNumbers(1, 50))
