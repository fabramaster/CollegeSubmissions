//: Playground - noun: a place where people can play

import Foundation

func payCheck(_ name: String, _ hoursWorked: Double, _ hourlyRate: Double, _ bonus: Double = 0.0) -> String {
    let regularHours = min(hoursWorked, 80.0)
    let overtimeHours = max(0.0, hoursWorked - 80.0)
    
    let regularPay = regularHours * hourlyRate
    let overtimePay = overtimeHours * (hourlyRate * 1.5)
    let totalPay = regularPay + overtimePay + bonus
    
    return "\(name): $\(String(format: "%.2f", totalPay))"
}

func reverseDigits(_ num: Int, _ reversedStr: String) -> String {
    if num < 0 {
        return "-" + reverseDigits(-num, reversedStr)
    }
    
    if num < 10 {
        return reversedStr + String(num)
    }
    
    let lastDigit = num % 10
    let remainingNum = num / 10
    return reverseDigits(remainingNum, String(lastDigit) + reversedStr)
}

print(payCheck("John Doe", 70.5, 21.5, 150.0))
print(payCheck("Peter Chan", 88.5, 20.0))

print(reverseDigits(1234, ""))
print(reverseDigits(-1230, ""))
print(reverseDigits(0, ""))
