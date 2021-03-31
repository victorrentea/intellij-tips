package victor.training;


import org.assertj.core.api.Assertions;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.currentTimeMillis;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class IntelliJPlay {

   public static void main(String[] args) {
     List<Integer> numbers = asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

      List<String> collect = numbers.stream().filter(n -> n % 2 == 0)
          .map(Objects::toString)
          .collect(Collectors.toList());

   }

   // ** Auto-Completion
   // - Contains / First letters, eg: person.gfn
   // - Over-dot completion, eg p.gfn, LDT.now()
   // - Static completion (CTRL-SPACE x 2), eg now, ctm; ALT-ENTER import static
   // - Type-safe Smart completion (CTRL-SHIFT-SPACE) + x2 = Chain Completion; eg methodTakingAMovie()
   // - Boilerplate completion: getter/setter/toString/hashCode-equals
   // - TAB completion (overwriting)

   // ** Templates
   // - Live Templates, eg. boot, main, sout + CUSTOM: >logs, soutc, pf
   // - Postfix Expansion, eg .sout .if .for .return + CUSTOM: .log .assertThat

   // ** SPEED-UP MAGIC
   // - Complete Statement (CTRL-SHIFT-ENTER): if, method, "wrap call around"
   // - Multi-cursor (ALT-J) << ROCKS; eg: enum
   // - Surround with (CTRL-ALT-T) eg: if, try

   // ** NAVIGATION / SELECTION
   // - Back/Forward (CTRL-ALT-LEFT/RIGHT)
   // - Recent Files (CTRL-E)
   // - Recent Locations (CTRL-SHIFT-E)
   // - Clipboard History (CTRL-SHIFT-V)
   // - Expand Selection (CTRL-[SHIFT]-W)

   // ** ALT-ENTER
   // - Define variable
   // - Move variable definition closer to usages
   // - Move return closer
   // - Clean up Customer

   // ** Java8
   // - ALT-enter on .stream <--> for
   // - Collecting: ctl, cs, cj
   // - Skip .stream().
   // - :: auto-completion


   /// ===========================

   // ** REFACTORING
   // - Extract var/meth (select blocks)
   // - Refactor this (CTRL-ALT-SHIFT-T)
   // - Extract Interface
   // - Introduce Parameter. Inline back
   // - Introduce Parameter Object. Reuse


   // Note: all keys are for windows

   // BONUS: SQL
}

