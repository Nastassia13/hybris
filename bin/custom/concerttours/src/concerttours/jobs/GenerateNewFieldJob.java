package concerttours.jobs;

import concerttours.service.DateTokenService;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import org.springframework.beans.factory.annotation.Required;

public class GenerateNewFieldJob extends AbstractJobPerformable<CronJobModel> {
    private DateTokenService dateTokenService;

    @Override
    public PerformResult perform(CronJobModel cronJobModel) {
        dateTokenService.generateNewFiledValue();
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }

    @Required
    public void setDateTokenService(DateTokenService dateTokenService) {
        this.dateTokenService = dateTokenService;
    }
}
