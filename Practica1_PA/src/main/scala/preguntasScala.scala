/*
Practica 1
Grupo numero 1
Integrantes:
Tony Renato Campoverde
Byron Marcelo Paucar
Lady Lilibeth Calva
Yhair Gerald Tejada
Jamil Sebastián Herrera
Manuel Richard Mora
Arianna Marikrys Ramón
 */

object preguntasScala extends App {

  /*
  List numbers = IntStream.generate(() -> ThreadLocalRandom.current().nextInt(10_000, 1_000_000)).limit(25).boxed().toList();
  numbers.stream().forEach(System.out::println)
   */

  // lista de numeros generados

  val num = List(392589, 488257, 793178, 98379, 775096, 818067, 250293, 795828
    , 153215, 798905, 878669, 531840, 863901, 387444, 886924, 325822, 354315
    , 614739, 779374, 830651, 507448, 558411, 310753, 10228, 654754)
  print("Lista original\n" + num)

  // Listado en forma ascendente
  val numAsc = num.sorted
  print("\nnumeros de forma ascendente\n" + numAsc)

  // Listado en forma descendente
  val numDes = numAsc.reverse

  print("\nNumeros de forma descendente\n" + numDes)

  //El listado de los números generados que son pares

  val numPar = num.filter((i: Int) => i % 2 == 0)
  print("\nNumeros Pares\n" + numPar)

  //El listado de los números generados que son pares
  val numImpar = num.filter((i: Int) => i % 2 != 0)
  print("\n Numeros Impares\n" + numImpar)

  //El listado de los números generados que son primos
  val numPrimos = num.filter(e => 1 == (1 until e).filter(i => e % i == 0).sum)
  print("\n Numeros Primos\n" + numPrimos)

  // - El listado de los números generados que son abundantes
  val abundantes = num.filter(e => e * 2 < (1 until e).filter(i => e % i == 0).sum)
  print("\nNumeros Abundantes\n" + abundantes)

  //El listado de los números generados que son perfectos
  val perfecto = num.filter(e => e == (1 until e).filter(i => e % i == 0).sum)
  print("\nNumeros perfectos\n" + perfecto)

  // - El listado de los números generados que son deficientes

  val deficientes = num.filter(e => e > (1 until e).filter(i => e % i == 0).sum)
  print("\nNumeros deficientes\n" + deficientes)

}
