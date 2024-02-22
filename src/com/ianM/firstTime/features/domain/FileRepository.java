package com.ianM.firstTime.features.domain;

import java.io.File;

public interface FileRepository {

    boolean checkFirstTime(File file);
    File save (String filename);

    int getContador(File filename);
    void incrementarContador(File filename);
}
