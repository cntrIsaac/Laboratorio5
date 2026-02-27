package co.edu.eci.blueprints.controllers;

/**
 * Respuesta uniforme para la API: código, mensaje y dato opcional.
 */
public record ApiResponseDto<T>(int code, String message, T data) { }
