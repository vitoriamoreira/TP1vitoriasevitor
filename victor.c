#include <stdio.h>
int main()
{
 int n1, n2, media=0;
  
 printf("Digite a Nota 1: ");
 scanf("%d", &n1);
  
 printf("Digite a Nota 2: ");
 scanf("%d", &n2);
  
 media = (n1 + n2)/2;
  
 if (media >= 6)
 {
     printf("Aluno Aprovado");
 }
 else 
 {
     printf("Aluno Reprovado");
 }
 int i;
 for (i=0; i<10; i++)
 {
     printf("%d\n", i);
     printf("acabou!");
 }    
 return 0;
 }
