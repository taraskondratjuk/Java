import {Component, OnInit} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {NgForm} from '@angular/forms';
import {ICar} from '../../models/ICar';
import {BASE_URL} from '../../settings/BASE_URL';

@Component({
  selector: 'app-cars',
  templateUrl: './cars.component.html',
  styleUrls: ['./cars.component.css']
})
export class CarsComponent implements OnInit {

  cars = [];

  car = {mark: '', model: '', price: 0};

  editedCar: ICar;

  isSaveFormVisible = 'block';
  isEditFormVisible = 'none';


  constructor(private httpClient: HttpClient) {
  }

  save(myForm: NgForm): void {
    this.httpClient.post<ICar>(BASE_URL + '/car/save', this.car).subscribe(() => {
      this.httpClient.get<ICar[]>(BASE_URL + '/car').subscribe(value => this.cars = value);
    });
  }

  saveEditedCar(myForm: NgForm): void {
    console.log(this.editedCar.id);
    console.log(this.car);
    this.httpClient.post<ICar>(BASE_URL + '/car/edit/' + this.editedCar.id, this.car).subscribe(() => {
      this.httpClient.get<ICar[]>(BASE_URL + '/car').subscribe(value => this.cars = value);
    });
  }

  deleteCar(id: number): void {
    this.httpClient.post<number>(BASE_URL + '/car/' + id, id).subscribe(() => {
      this.httpClient.get<ICar[]>(BASE_URL + '/car').subscribe(value => this.cars = value);
    });
  }


  editCar(car: ICar): void {
    this.editedCar = car;
    this.isSaveFormVisible = 'none';
    this.isEditFormVisible = 'block';
  }

  hideEditBlock(): void {
    this.isSaveFormVisible = 'block';
    this.isEditFormVisible = 'none';
  }

  ngOnInit(): void {
    this.httpClient.get<ICar[]>(BASE_URL + '/car').subscribe(value => this.cars = value);
  }

}
