import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { MusicasRoutingModule } from './musicas-routing.module';
import { MusicasComponent } from './musicas/musicas.component';
import { AppMaterialModule } from '../compartilhado/app-material/app-material.module';
import { CompartilhadoModule } from '../compartilhado/compartilhado.module';
import { FormMusicaComponent } from './form-musica/form-musica.component';

@NgModule({
  declarations: [
    MusicasComponent,
    FormMusicaComponent
  ],
  imports: [
    CommonModule,
    MusicasRoutingModule,
    AppMaterialModule,
    CompartilhadoModule
  ]
})
export class MusicasModule { }
