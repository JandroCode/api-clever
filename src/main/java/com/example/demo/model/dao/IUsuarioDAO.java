package com.example.demo.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.entities.Usuario;

@Repository
public interface IUsuarioDAO extends JpaRepository<Usuario,Long>{

}
