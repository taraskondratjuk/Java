import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {ICar} from '../../models/ICar';


@Component({
  selector: 'app-car',
  templateUrl: './car.component.html',
  styleUrls: ['./car.component.css']
})
export class CarComponent implements OnInit {

  @Input()
  car: ICar;

  @Output()
  deletedCarUp = new EventEmitter();

  @Output()
  editedCarUp = new EventEmitter();


  constructor() {
  }

  getDeletedCar(id: number): void {
    this.deletedCarUp.emit(id);
  }

  getEditedCar(car: ICar): void {
    this.editedCarUp.emit(car);
  }


  ngOnInit(): void {
  }

}
