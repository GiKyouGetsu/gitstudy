import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FooterInfComponent } from './footer-inf.component';

describe('FooterInfComponent', () => {
  let component: FooterInfComponent;
  let fixture: ComponentFixture<FooterInfComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FooterInfComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FooterInfComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
