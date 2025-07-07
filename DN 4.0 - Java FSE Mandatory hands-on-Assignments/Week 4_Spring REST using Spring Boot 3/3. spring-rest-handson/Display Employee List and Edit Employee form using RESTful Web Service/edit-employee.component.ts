import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Employee, EmployeeService } from '../employee.service';

@Component({
  selector: 'app-edit-employee',
  templateUrl: './edit-employee.component.html'
})
export class EditEmployeeComponent implements OnInit {
  employee: Employee = { id: 0, name: '', department: '', salary: 0 };

  constructor(private route: ActivatedRoute, private empService: EmployeeService) {}

  ngOnInit(): void {
    const id = Number(this.route.snapshot.paramMap.get('id'));
    this.empService.getEmployeeById(id).subscribe(data => this.employee = data);
  }
}
