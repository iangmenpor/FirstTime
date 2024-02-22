package com.ianM.firstTime.features.domain;

import java.io.File;

public class FirstTimeCheckerUseCase {

    private final FileRepository fileRepository;

    public FirstTimeCheckerUseCase(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    public boolean execute(File filename){
        return fileRepository.checkFirstTime(filename);
    }
}
