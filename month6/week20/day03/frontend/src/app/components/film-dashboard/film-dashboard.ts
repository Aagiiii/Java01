import { Component, inject, OnInit } from '@angular/core';
import { FilmService } from '../../services/film.service';
import { BehaviorSubject } from 'rxjs/internal/BehaviorSubject';
import { combineLatest, debounceTime, distinctUntilChanged, Observable, switchMap, tap } from 'rxjs';
import { Page } from '../../models/page';
import { Film } from '../../models/film';
import { CommonModule } from '@angular/common';


@Component({
  selector: 'app-film-dashboard',
  standalone:true,
  imports: [CommonModule],
  templateUrl: './film-dashboard.html',
  styleUrl: './film-dashboard.css',
  
})
export class FilmDashboard implements OnInit {
  private filmService = inject(FilmService);

  private page$ = new BehaviorSubject<number>(0);
  private size$ = new BehaviorSubject<number>(10);
  private search$ = new BehaviorSubject<string>("");

  filmPage$!: Observable<Page<Film>>;
  isLoading = false;

  ngOnInit(): void{
    this.filmPage$ = combineLatest([
      this.page$,
      this.size$,
      this.search$.pipe(
        debounceTime(400),
        distinctUntilChanged()
      )
    ]).pipe(
      tap(() => this.isLoading =true),
      switchMap(([page , size , search]) => this.filmService.getFilms(page , size , search)
    ),
    tap(() => this.isLoading =false));
  }

  onSearchChange(keyword: string): void{
    this.search$.next(keyword);
    this.page$.next(0);
  }

  onPageChange(targetPage: number): void{
    this.page$.next(targetPage);
  }


}

  export interface PageData {
  content: any[];
  number: number;
  totalPages: number;
  totalElements: number;
}
