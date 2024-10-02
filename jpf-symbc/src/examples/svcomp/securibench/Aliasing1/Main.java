package svcomp.securibench.Aliasing1;// SPDX-FileCopyrightText: 2021 Falk Howar falk.howar@tu-dortmund.de
// SPDX-License-Identifier: Apache-2.0

// This file is part of the SV-Benchmarks collection of verification tasks:
// https://gitlab.com/sosy-lab/benchmarking/sv-benchmarks

import java.io.IOException;
import org.sosy_lab.sv_benchmarks.Verifier;
import svcomp.securibench.micro.mockx.servlet.http.HttpServletRequest;
import svcomp.securibench.micro.mockx.servlet.http.HttpServletResponse;
import svcomp.securibench.micro.securibench.micro.aliasing.Aliasing1;

public class Main {

  public static void main(String[] args) {
    String s1 = Verifier.nondetString();
    HttpServletRequest req = new HttpServletRequest();
    HttpServletResponse res = new HttpServletResponse();
    req.setTaintedValue(s1);

    Aliasing1 sut = new Aliasing1();
    try {
      sut.doGet(req, res);
    } catch (IOException e) {

    }
  }
}
