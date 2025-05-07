package com.grepp.spring.app.model.student;

import com.grepp.spring.app.controller.api.student.payload.StudentRecommendRequest;
import com.grepp.spring.app.controller.api.student.payload.StudentRecommendResponse;
import com.grepp.spring.app.model.student.code.Sentimental;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface StudentAiService {

    @SystemMessage("너는 다정하고 친절한 상담사야.")
    String chat(String message);
    Sentimental classify(String message);

    @SystemMessage("당신은 성향과 전공을 고려해 5명의 팀원을 구성해야 하는 팀장입니다.")
    StudentRecommendResponse recommendTeam(StudentRecommendRequest request);
}
