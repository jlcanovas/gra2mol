Gra2MoL
=======

What is this project about?
---------------------------

Gra2MoL (Grammar to Model Language) is a domain specific transformation language to define the relationships between grammar elements and metamodel elements. It is a rule based language like model transformation languages as RubyTL or ATL. In Gra2MoL you define the source element (grammar), the target element (metamodel) and some metamodel initialization sentences. The main difference with a model transformation language is that Gra2MoL is oriented to extract models from source programs. Moreover, Gra2MoL defines a powerful language for traversing the syntax tress and for extracting information from the source code.

Description
-----------

A model-driven modernization process requires models to be extracted from legacy software and most software modernization scenarios involve dealing with source code written in some programming language. Thus, a bridge from grammarware to modelware technical spaces must be built to extract models from source code. Gra2MoL allows building a bridge between these technical spaces and intends to solve the current problems for extracting models from source code files in model driven development.

Gra2MoL has been specifically designed to address the problem of extracting models from source code. Gra2MoL is a rule-based transformation language like existing model-to-model transformation languages such as ATL or RubyTL, but with the fundamental difference that the source element of a rule is a grammar element instead of a source metamodel element. In this way, the language natively deals with grammars as source artifacts. Another important difference is that the language provides domain-specific features to address specific issues in grammar-to-model transformations. For instance, Gra2MoL provides a query language to ease the traversal of the syntax tree.

The execution process of Gra2MoL is showed in this Figure:

![Gra2MoL Process](/process.jpg?raw=true "Gra2MoL Process")

The parameters of a Gra2MoL transformation are: (1) source grammar, (2) target metamodel y (3) Gra2MoL transformation definition. The transformacion process of Gra2MoL begins with the CST extractor. This tool is generated from the grammar of the source code and it builds a sintax tree from the set of source files. Gra2MoL engine is parametrized with the Gra2MoL transformation definition, the target metamodel, and the syntax tree. The result of the Gra2MoL engine is a model that conforms to the target metamodel.

Features
--------
 * Language specially tailored for extracting models from code conforming to a grammar
 * Powerful query language to traverse syntax trees
 * Extensibility mechanism to add new operators in mapping section
 * Island grammars support
 * Java API
 * CDO support for storing large models
 * Support for mixin and copy rules
 * Extensibility mechanism to add new query operators

What is coming next?
--------------------

This project was part of my PhD work and is pretty stalled right now. I have some ideas in mind to improve it but, as usually happens, I don't have time to do everything. Any help is more than welcome!

Who is behind this project?
---------------------------
* [Javier Canovas](http://github.com/jlcanovas/ "Javier Canovas")
