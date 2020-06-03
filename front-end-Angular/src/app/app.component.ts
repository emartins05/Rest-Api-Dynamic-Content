import {Component, OnInit} from '@angular/core';
import {AppService} from './app.service';

import {DomSanitizer} from '@angular/platform-browser';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'dynamic-content';
  public fetchedVideos: any[];

  constructor(private videoService: AppService, public sanitizer: DomSanitizer){
  }


  ngOnInit() {
    this.videoService.getVideos().subscribe(
      (response: any[]) => this.fetchedVideos = response
    );
  }
}
