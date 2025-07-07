import { Component, OnInit } from '@angular/core';
import { EmployeeService, Employee } from '../employee.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html'
})
export class EmployeeListComponent implements OnInit {
  employees: Employee[] = [];

  constructor(private empService: EmployeeService, private router: Router) {}

  ngOnInit(): void {
    this.empService.getAllEmployees().subscribe(data => this.employees = data);
  }

  editEmployee(id: number) {
    this.router.navigate(['/edit', id]);
  }
}
