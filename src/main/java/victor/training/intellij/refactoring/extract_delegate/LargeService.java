package victor.training.intellij.refactoring.extract_delegate;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import victor.training.intellij.support.colors.*;

@Service
@RequiredArgsConstructor
public class LargeService {
   private final YellowRepo yellowRepo;
   private final BlueRepo blueRepo;
   private final GreenRepo greenRepo;

   public void top1(long aId, long bId) {
      // extract me
      Yellow yellow = yellowRepo.findById(aId);
      Blue blue = blueRepo.findById(bId);
      int greenValue = yellow.getTotal() + blue.getTotal();

      Green green = new Green(greenValue);
      greenRepo.save(green);
   }

   public int top2(long betaId) {
      Blue blue = blueRepo.findById(betaId);
      return blue.getTotal();
   }
}
// - extract delegate
// - inline delegate
