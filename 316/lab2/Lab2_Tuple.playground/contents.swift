//: Playground - noun: a place where people can play

struct Employee {
   let name: String?
   let id: String?
   let jobtitle: String?
   let yearOfService: Int?
   let annualsalary: Double?
   
   init(name: String? = nil, id: String? = nil, title: String? = nil, year: Int? = nil,
        salary: Double? = nil) {
       self.name = name
       self.id = id
       jobtitle = title
       yearOfService = year
       annualsalary = salary
   }
}

let employee1 = Employee(name: "Peter Long", id: "112-22-3011", title: "Volunteer Worker", 
                       year: 5, salary: 1200.00)
let employee2 = Employee(name: "Martin Short", id: "116-23-6418", title: "Manager", 
                       year: 8, salary: 78600.00)
let employee3 = Employee(name: "Susan Johnson", id: "123-32-3515", title: "Receptionist", 
                       year: 10, salary: 38600.00)
let employee4 = Employee(name: "Paul Simon", id: "133-53-4019", title: "System Support Analyst", 
                       year: 8, salary: 65000.00)

var employees: [Employee] = [employee1, employee2, employee3, employee4]

print("Employee information from array:")
for employee in employees {
   if let name = employee.name,
      let id = employee.id,
      let title = employee.jobtitle {
       print("\(name) \(id) \(title)")
   }
}

func highestSalary(emps: [Employee]) -> Employee {
   var highestPaidEmployee = emps[0]
   
   for emp in emps {
       if let empSalary = emp.annualsalary,
          let highestSalary = highestPaidEmployee.annualsalary,
          empSalary > highestSalary {
           highestPaidEmployee = emp
       }
   }
   
   return highestPaidEmployee
}

print("\nHighest paid employee from array: ", highestSalary(emps: employees))

var dict_employees: [String: Employee] = [:]

for employee in employees {
   if let id = employee.id {
       dict_employees[id] = employee
   }
}

print("\nEmployee information from dictionary:")
for (_, employee) in dict_employees {
   if let name = employee.name,
      let id = employee.id,
      let title = employee.jobtitle {
       print("\(name) \(id) \(title)")
   }
}

func highestSalaryDict(emps: [String: Employee]) -> Employee {
   var highestPaidEmployee = emps.first!.value
   
   for (_, emp) in emps {
       if let empSalary = emp.annualsalary,
          let highestSalary = highestPaidEmployee.annualsalary,
          empSalary > highestSalary {
           highestPaidEmployee = emp
       }
   }
   
   return highestPaidEmployee
}

print("\nHighest paid employee from dictionary: ", highestSalaryDict(emps: dict_employees))