package com.daveayan.croutons
import org.yaml.snakeyaml.Yaml

object YamlTrial {

  def main(args: Array[String]) {
    var yaml: Yaml = new Yaml();
    
    val lines = scala.io.Source.fromFile("src/main/resources/sentence_constructs.yaml").mkString
    
    System.out.println(lines);
    System.out.println(yaml.dump(yaml.load(lines)));
  }
}