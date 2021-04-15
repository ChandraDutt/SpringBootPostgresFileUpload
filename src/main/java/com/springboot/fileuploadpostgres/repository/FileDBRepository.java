package com.springboot.fileuploadpostgres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.fileuploadpostgres.model.FileDB;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {

}