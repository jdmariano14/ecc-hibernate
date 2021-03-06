package com.exist.ecc.person.core.service.input.impl;

import java.util.Scanner;

import com.exist.ecc.person.core.service.input.api.InputReader;

public class ConsoleReader implements InputReader {

  private Scanner scanner;

  public ConsoleReader(Scanner scanner) {
    setScanner(scanner);
  }

  public void setScanner(Scanner scanner) {
    this.scanner = scanner;
  }

  public String read(String message) {
    System.out.print(message);

    return scanner.nextLine();
  }

}