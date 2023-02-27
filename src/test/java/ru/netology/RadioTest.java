package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
 @Test
 public void nextCurrentStationTestNormalStation() {
  Radio radio = new Radio();
  radio.setMaxStation(9);
  radio.setMinStation(0);
  radio.setCurrentStation(4);
  radio.nextCurrentStation();
  assertEquals(5, radio.getCurrentStation());
 }

 @Test
 public void nextCurrentStationTestMaxBorderStation() {
  Radio radio = new Radio();
  radio.setMaxStation(9);
  radio.setMinStation(0);
  radio.setCurrentStation(9);
  radio.nextCurrentStation();
  assertEquals(0, radio.getCurrentStation());
 }

 @Test
 public void prevCurrentStationTestNormalStation() {
  Radio radio = new Radio();
  radio.setMaxStation(9);
  radio.setMinStation(0);
  radio.setNumberStation(6);
  radio.setCurrentStation(4);
  radio.prevCurrentStation();
  assertEquals(3, radio.getCurrentStation());
 }

 @Test
 public void prevCurrentStationTestMinBorderStation() {
  Radio radio = new Radio();
  radio.setMaxStation(9);
  radio.setMinStation(0);
  radio.setNumberStation(6);
  radio.setCurrentStation(0);
  radio.prevCurrentStation();
  assertEquals(9, radio.getCurrentStation());

 }

 @Test
 public void remoteCurrentStationTestOverMaxStation() {
  Radio radio = new Radio();
  radio.setMaxStation(9);
  radio.setMinStation(0);
  radio.setCurrentStation(4);
  radio.remoteCurrentStation(10);
  assertEquals(9, radio.getCurrentStation());
 }

 @Test
 public void remoteCurrentStationTestUndereMinStation() {
  Radio radio = new Radio();
  radio.setMaxStation(9);
  radio.setMinStation(0);
  radio.setCurrentStation(4);
  radio.remoteCurrentStation(-1);
  assertEquals(0, radio.getCurrentStation());
 }

 @Test
 public void nextCurrentVolumeTestNormalVolume() {
  Radio radio = new Radio();
  radio.setMaxVolume(10);
  radio.setMinVolume(0);
  radio.setCurrentVolume(4);
  radio.nextCurrentVolume();
  assertEquals(5, radio.getCurrentVolume());
 }

 @Test
 public void nextCurrentVolumeTestMaxBorderVolume() {
  Radio radio = new Radio();
  radio.setMaxVolume(10);
  radio.setMinVolume(0);
  radio.setCurrentVolume(10);
  radio.nextCurrentVolume();
  assertEquals(10, radio.getCurrentVolume());
 }

 @Test
 public void prevCurrentVolumeTestNormalVolume() {
  Radio radio = new Radio();
  radio.setMaxVolume(10);
  radio.setMinVolume(0);
  radio.setCurrentVolume(4);
  radio.prevCurrentVolume();
  assertEquals(3, radio.getCurrentVolume());
 }

 @Test
 public void prevCurrentVolumeTestMinBorderVolume() {
  Radio radio = new Radio();
  radio.setMaxVolume(10);
  radio.setMinVolume(0);
  radio.setCurrentVolume(0);
  radio.prevCurrentVolume();
  assertEquals(0, radio.getCurrentVolume());
 }

 @Test
 public void setMaxStationTest() {
  Radio radio = new Radio();
  radio.setMaxStation(9);
  assertEquals(9, radio.getMaxStation());
 }

 @Test
 public void setMinStationTest() {
  Radio radio = new Radio();
  radio.setMinStation(0);
  assertEquals(0, radio.getMinStation());
 }

 @Test
 public void setCurrentStationTestOverMaxStation() {
  Radio radio = new Radio();
  radio.setMaxStation(9);
  radio.setMinStation(0);
  radio.setNumberStation(9);
  radio.setCurrentStation(8);
  radio.setCurrentStation(60);
  assertEquals(8, radio.getCurrentStation());
 }

 @Test
 public void setCurrentStationTestUnderMinStation() {
  Radio radio = new Radio();
  radio.setMaxStation(9);
  radio.setMinStation(0);
  radio.setNumberStation(9);
  radio.setCurrentStation(8);
  radio.setCurrentStation(-1);
  assertEquals(8, radio.getCurrentStation());
 }
}
