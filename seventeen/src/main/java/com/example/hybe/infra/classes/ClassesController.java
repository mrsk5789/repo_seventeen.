package com.example.hybe.infra.classes;

@Controller
public class ClassesController {
	
	@Autowired
	ClassesService classesService;
	
	
	@RequestMapping(value="/xdm/v1/infra/classes/classesXdmList")
	public String classesXdmList(Model model, ClassesVo classesvo ) {
		
		model.addAttribute("list", classesService.selectList(classesvo));
		
//		System.out.println("codegroups.size():"+codeGroups.size());
//		for(CodeGroupDto codeGroupDto:codeGroups) {
//			System.out.println(codeGroupDto.getIfcgSeq() +"|"+
//								codeGroupDto.getIfcgRenDate() +"|");}
		return "/xdm/v1/infra/Classes/classesXdmList";
	}
	@RequestMapping(value="/xdm/v1/infra/classes/classesXdmForm")
	public String classesXdmForm() {
		return "/xdm/v1/infra/classes/classesXdmForm";
	}
	@RequestMapping(value="/xdm/v1/infra/classes/classesXdmInst")
	public String classesXdmInst(ClassesDto classesDto) {
		
		System.out.println("classesDto.getName():"+classesDto.getClassName());
		classesService.insert(classesDto);
		
		return "redirect:/xdm/v1/infra/classes/classesXdmList";
	}
	
	@RequestMapping(value="/xdm/v1/infra/classes/classesXdmMForm")
	public String classesXdmMForm(ClassesDto classesDto, Model model) {
	    model.addAttribute("item", classesService.selectOne(classesDto));
	    System.out.println("classesdto");
	    return "/xdm/v1/infra/classes/classesXdmMForm";
    }
	
	//수정 update
		@RequestMapping(value="/xdm/v1/infra/classes/classesXdmUpdt")
		public String classesUpdt(ClassesDto classesDto){
			
			classesService.update(classesDto);
			System.out.println("classDto");
			
			return "redirect:/xdm/v1/infra/classes/classesXdmList";
		}
	
	//uelete
		@RequestMapping(value="/xdm/v1/infra/classes/classesXdmUele")
		public String classesXdmUele(ClassesDto classesDto){
			
			classesService.uelete(classesDto);
			System.out.println("classD");
			
			return "redirect:/xdm/v1/infra/classes/classesXdmList";
		}
		
		//delete
		@RequestMapping(value="/xdm/v1/infra/classes/classesXdmDele")
		public String classesXdmDele(ClassesDto classesDto){
			
			classesService.delete(classesDto);
			System.out.println("delete");
			
			
			return "redirect:/xdm/v1/infra/classes/classesXdmList";
		}
}
