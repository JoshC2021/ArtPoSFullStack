import { Component, OnInit } from '@angular/core';
import { Picture } from './picture';
import { PictureService } from './picture.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit {
  title = 'PointOfSaleFE';

  public pictures:Picture[] = [];


  constructor(private pictureService: PictureService) { }

  ngOnInit() {
    this.getPictures();
  }

  public getPictures():void {
    this.pictureService.getPictures().subscribe(
      (response:Picture[]) => {
        this.pictures = response;
      });
  }
}
