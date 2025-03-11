//: Playground - noun: a place where people can play
//: # Lab Assignment #3

import Foundation
import UIKit


// Employee base class
class Employee {
    var name: String
    var id: String
    var jobTitle: String
    var yearsOfService: Int
    
    init(name: String, id: String, jobTitle: String, yearsOfService: Int) {
        self.name = name
        self.id = id
        self.jobTitle = jobTitle
        self.yearsOfService = yearsOfService
    }
    
    func pay() -> Double {
        return 100.00 
    }
    
    func toString() -> String {
        return """
        Name: \(name)
        ID: \(id)
        Title: \(jobTitle)
        Years of Service: \(yearsOfService)
        """
    }
}

//: ## Volunteer Class
class Volunteer: Employee {
    override func toString() -> String {
        return """
        Name: \(name)
        ID: \(id)
        Title: \(jobTitle)
        Years of Service: \(yearsOfService)
        Reimbursement amount: $\(String(format: "%.2f", pay()))
        Thank you for your volunteer work and time!
        """
    }
}

//: ## SalaryEmployee Class
class SalaryEmployee: Employee {
    var annualSalary: Double
    
    init(name: String, id: String, jobTitle: String, yearsOfService: Int, annualSalary: Double) {
        self.annualSalary = annualSalary
        super.init(name: name, id: id, jobTitle: jobTitle, yearsOfService: yearsOfService)
    }
    
    override func pay() -> Double {
        return annualSalary / 26 // biweekly paycheck
    }
    
    override func toString() -> String {
        return """
        Name: \(name)
        ID: \(id)
        Title: \(jobTitle)
        Years of Service: \(yearsOfService)
        Annual Salary: $\(String(format: "%.2f", annualSalary))
        Paycheck Amount: $\(String(format: "%.2f", pay()))
        """
    }
}

//: ## HourlyEmployee Class
class HourlyEmployee: Employee {
    var hourlyRate: Double
    var hoursWorked: Double
    
    init(name: String, id: String, jobTitle: String, yearsOfService: Int, hourlyRate: Double, hoursWorked: Double) {
        self.hourlyRate = hourlyRate
        self.hoursWorked = hoursWorked
        super.init(name: name, id: id, jobTitle: jobTitle, yearsOfService: yearsOfService)
    }
    
    override func pay() -> Double {
        if hoursWorked <= 80 {
            return hourlyRate * hoursWorked
        } else {
            return (hourlyRate * 80) + (hourlyRate * (hoursWorked - 80) * 1.5)
        }
    }
    
    override func toString() -> String {
        return """
        Name: \(name)
        ID: \(id)
        Title: \(jobTitle)
        Years of Service: \(yearsOfService)
        Hourly Rate: $\(String(format: "%.2f", hourlyRate))
        Hours Worked: \(String(format: "%.1f", hoursWorked))
        Paycheck Amount: $\(String(format: "%.2f", pay()))
        """
    }
}

//: ## Executive Class
class Executive: SalaryEmployee {
    var bonus: Double = 0.0
    
    override func pay() -> Double {
        return super.pay() + bonus
    }
    
    override func toString() -> String {
        return """
        Name: \(name)
        ID: \(id)
        Title: \(jobTitle)
        Years of Service: \(yearsOfService)
        Annual Salary: $\(String(format: "%.2f", annualSalary))
        Paycheck Amount: $\(String(format: "%.2f", pay()))
        Bonus Awarded: $\(String(format: "%.2f", bonus))
        """
    }
}

//: ## Testing Employee Classes

//: ### Creating Employee Instances
var emp1 = Volunteer(name: "Peter Long", id: "112-22-3011", jobTitle: "Volunteer Worker", yearsOfService: 5)
print(emp1.toString())
print("-" * 68)

var emp2 = SalaryEmployee(name: "Martin Short", id: "116-23-6418", jobTitle: "Manager", yearsOfService: 8, annualSalary: 78600.00)
print(emp2.toString())
print("-" * 68)

var emp3 = HourlyEmployee(name: "Susan Johnson", id: "123-32-3515", jobTitle: "Receptionist", yearsOfService: 10, hourlyRate: 16, hoursWorked: 84)
print(emp3.toString())
print("-" * 68)

var emp4 = HourlyEmployee(name: "Paul Simon", id: "133-53-4019", jobTitle: "System Support Analyst", yearsOfService: 4, hourlyRate: 22.0, hoursWorked: 75)
print(emp4.toString())
print("-" * 68)

var emp5 = Executive(name: "Steve Job", id: "111-22-3333", jobTitle: "CEO", yearsOfService: 25, annualSalary: 1000000.0)
print(emp5.toString())
print("\n" + "-" * 68)
print("3% bonus to be awarded for this paycheck:\n")
emp5.bonus = emp5.pay() * 0.03
print(emp5.toString())
emp5.bonus = 0.0
print("-" * 68)

print("printing all employees using an array!")
let employees: [Employee] = [emp1, emp2, emp3, emp4, emp5]
emp5.bonus = emp5.pay() * 0.03

for employee in employees {
    print(employee.toString())
    print("-" * 68)
}

print("printing all employees using a Dictionary!")
var employeeDict: [String: Employee] = [:]
for employee in employees {
    employeeDict[employee.id] = employee
}

for (_, employee) in employeeDict {
    print(employee.toString())
    print("-" * 68)
}