<div align="center">
  <h1> DECORATOR  </h1>
</div>

# Code

Simple project representing the decorator design pattern. 

# Definition

In object-oriented programming, the decorator pattern is a design pattern that allows behavior to be added to an individual object, dynamically, without affecting the behavior of other objects from the same class. The decorator pattern is often useful for adhering to the Single Responsibility Principle, as it allows functionality to be divided between classes with unique areas of concern. Decorator use can be more efficient than subclassing, because an object's behavior can be augmented without defining an entirely new object.

![image](https://user-images.githubusercontent.com/40416044/148065299-0dcb20a4-cb09-4ab7-8e46-ae1d91c84775.png)

The decorator pattern can be used to extend (decorate) the functionality of a certain object statically, or in some cases at run-time, independently of other instances of the same class, provided some groundwork is done at design time. This is achieved by designing a new Decorator class that wraps the original class.

# What problems can it solve?

- Responsibilities should be added to (and removed from) an object dynamically at run-time.
- A flexible alternative to subclassing for extending functionality should be provided.

When using subclassing, different subclasses extend a class in different ways. But an extension is bound to the class at compile-time and can't be changed at run-time






Source: <a href="https://pt.wikipedia.org/wiki/Decorator"> Wikipedia </a> | <a href="https://refactoring.guru/pt-br/design-patterns/decorator"> Refactoring Guru </a>
