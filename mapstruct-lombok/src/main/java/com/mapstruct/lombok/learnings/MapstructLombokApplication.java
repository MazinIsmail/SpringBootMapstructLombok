package com.mapstruct.lombok.learnings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * What is it?
 * 
 * MapStruct is a code generator that greatly simplifies the implementation of
 * mappings between Java bean types based on a convention over configuration
 * approach.
 * 
 * The generated mapping code uses plain method invocations and thus is fast,
 * type-safe and easy to understand.
 * 
 * 
 * Why?
 * 
 * Multi-layered applications often require to map between different object
 * models (e.g. entities and DTOs). Writing such mapping code is a tedious and
 * error-prone task. MapStruct aims at simplifying this work by automating it as
 * much as possible.
 * 
 * In contrast to other mapping frameworks MapStruct generates bean mappings at
 * compile-time which ensures a high performance, allows for fast developer
 * feedback and thorough error checking.
 */
@SpringBootApplication
public class MapstructLombokApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapstructLombokApplication.class, args);
	}

}
