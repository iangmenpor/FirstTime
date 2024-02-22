package com.ianM.firstTime.features.domain;

import java.io.File;

public class IncreaseCountUseCase {
    private final FileRepository fileRepository;

    public IncreaseCountUseCase(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    public void execute(File filename){
         fileRepository.incrementarContador(filename);
    }
}
