import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Picture } from './picture';

@Injectable({
  providedIn: 'root'
})
export class PictureService {

  private apiServiceUrl:string = "http://localhost:8080/picture";

  constructor(private http: HttpClient) { }

  public getPictures(): Observable<Picture[]> {
    return this.http.get<Picture[]>(`${this.apiServiceUrl}/all`);
    
  }

  public getPictureById(id:number): Observable<Picture> {
    return this.http.get<Picture>(`${this.apiServiceUrl}/find/${id}`);
    
  }

  public addPicture(picture:Picture): Observable<Picture[]> {
    return this.http.post<Picture[]>(`${this.apiServiceUrl}/add`,picture);
    
  }
  
  public updatePicture(picture:Picture): Observable<Picture[]> {
    return this.http.put<Picture[]>(`${this.apiServiceUrl}/update`,picture);
    
  }

  public deletePicture(id:number): Observable<void> {
    return this.http.delete<void>(`${this.apiServiceUrl}/delete/${id}`);
    
  }
}
