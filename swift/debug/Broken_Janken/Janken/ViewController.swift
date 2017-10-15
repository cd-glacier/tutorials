//
//  ViewController.swift
//  Janken
//
//  Created by Takuto Nakamura on 2017/08/06.
//  Copyright © 2017年 CATK. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

	@IBOutlet weak var me1: UIImageView!
	@IBOutlet weak var me2: UIImageView!
	@IBOutlet weak var me3: UIImageView!
	@IBOutlet weak var npc1: UIImageView!
	@IBOutlet weak var npc2: UIImageView!
	@IBOutlet weak var npc3: UIImageView!

	@IBOutlet weak var me: UIImageView!
	@IBOutlet weak var npc: UIImageView!

	@IBOutlet weak var hand_gu: UIButton!
	@IBOutlet weak var hand_choki: UIButton!
	@IBOutlet weak var hand_pa: UIButton!

	@IBOutlet weak var resultLabel: UILabel!

	var me_count: Int!
	var npc_count: Int!

	override func viewDidLoad() {
		super.viewDidLoad()
		me_count = 0
		npc_count = 0

		me1.isHidden = true
		me2.isHidden = true
		me3.isHidden = true

		npc1.isHidden = true
		npc2.isHidden = true
		npc3.isHidden = true

		me.image = UIImage(named: "hand_?.png")
		npc.image = UIImage(named: "hand_?.png")

		resultLabel.text = ""
	}

	override func didReceiveMemoryWarning() {
		super.didReceiveMemoryWarning()
	}

	@IBAction func selectHand(_ sender: UIButton) {
		hand_gu.isEnabled = false
		hand_choki.isEnabled = false
		hand_pa.isEnabled = false

		let me_hand: Int = sender.tag
        print(me_hand)
		if me_hand == 0 {
			me.image = UIImage(named: "me_gu.png")
		} else if me_hand == 1 {
			me.image = UIImage(named: "me_choki.png")
		} else {
			me.image = UIImage(named: "me_pa.png")
		}

		let npc_hand: Int = Int(arc4random()) % 3
		if npc_hand == 0 {
			npc.image = UIImage(named: "npc_gu.png")
		} else if npc_hand == 1 {
			npc.image = UIImage(named: "npc_choki.png")
		} else {
			npc.image = UIImage(named: "npc_pa.png")
		}

		if me_hand - npc_hand == -1 || me_hand - npc_hand == 2 { //勝ち
			me_count = me_count + 1
			resultLabel.text = "かち"
			if me_count == 1 {
				me1.isHidden = false
			} else if me_count == 2 {
				me2.isHidden = false
			} else if me_count == 3 {
				me3.isHidden = false
			}
		} else if me_hand - npc_hand == -2 || me_hand - npc_hand == 1 { //負け
			npc_count = npc_count + 1
			resultLabel.text = "まけ"
			if npc_count == 1 {
				npc1.isHidden = false
			} else if npc_count == 2 {
				npc2.isHidden = false
			} else if npc_count == 3 {
				npc3.isHidden = false
			}
		} else {
			resultLabel.text = "あいこ"
		}

		Timer.scheduledTimer(withTimeInterval: 2, repeats: false) { (t) in
			self.resultLabel.text = ""
			self.me.image = UIImage(named: "hand_?.png")
			self.npc.image = UIImage(named: "hand_?.png")

			self.hand_gu.isEnabled = true
			self.hand_choki.isEnabled = true
			self.hand_pa.isEnabled = true

			if self.me_count == 3 {
				self.performSegue(withIdentifier: "win", sender: nil)
			} else if self.npc_count == 3 {
				self.performSegue(withIdentifier: "lose", sender: nil)
			}
		}
	}

}

