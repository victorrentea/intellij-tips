package victor.training;


import victor.training.dirty.Customer;
import victor.training.dirty.Movie;
import victor.training.dirty.Rental;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class IntelliJPlay {

   public static void main(String[] args) {
      List<Integer> numbers = asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

      Customer customer = new Customer();

//      LocalDateTime now =

   }

   public static void processMovie(Movie movie) {
      System.out.println("Logic with " + movie);
   }

   // Contact: victorrentea@gmail.com
   // Video Courses, Masterclasses, Company Training: victorrentea.ro
   // Mac: ⌥ = "Option", ^ = "Ctrl"

   // ** Auto-Completion
   // - Contains (person.first) / words' first letters (person.gfn)
   // - Over-dot completion, eg p.gfn, S.ctm()
   // - Static completion (CTRL-SPACE x 2), eg ctm, assertEquals; ALT-ENTER import static
   // - Boilerplate completion: getter/setter/toString/hashCode+equals
   // - Type-safe Smart completion (CTRL-SHIFT-SPACE || ^⌥Space)
   //     > Chain Completion; eg processMovie(_)
   // - TAB completion (overwriting)

   // ** Templates
   // - Live Templates, eg. main, sout + CUSTOM: >logs, soutc, pf
   // - Postfix Expansion, eg .sout .if .for .return + CUSTOM: .log ($EXPR$.log) .assertThat

   // ** SPEED-UP MAGIC
   // - Complete Current Statement (CTRL-SHIFT-ENTER :: ⇧⌘Enter):
   //    > if, method
   //    > wrap call around eg Optional.ofNullable
   // - Multi-cursor (ALT-J :: ^G) eg: enum; F3=skip; CTRL-ALT-SHIFT-J=all
   // - Surround with (CTRL-ALT-T :: ⌥⌘T) eg: if, try
   // - Select + "'`<([{

   // ** NAVIGATION / SELECTION
   // - Back/Forward (CTRL-ALT-LEFT/RIGHT :: ⌘[ / ⌘])
   // - Recent Files (CTRL-E :: ⌘E)
   // - Recent Locations (CTRL-SHIFT-E)
   // - Clipboard History (CTRL-SHIFT-V :: ⇧⌘V)
   // - Expand Selection (CTRL-[SHIFT]-W :: ⌥ ↑)
   // - Call hierarchy (CTRL-ALT-H :: ^⌥H)

   // ** Stream support
   // - ALT-Enter on .stream <--> for
   // - Collecting: ctl, cs, cj
   // - Skip ".stream()"...
   // - :: auto-completion

   // ** Context Actions: ALT-ENTER :: ⌥⏎
   // - Define variable
   // - Move variable definition closer to usages
   // - Move return closer
   // - Clean up Customer

}

